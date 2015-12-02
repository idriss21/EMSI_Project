package app.ieee.ma.emsi.navdrawtest.viewHolder_class;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import app.ieee.ma.emsi.navdrawtest.R;
import app.ieee.ma.emsi.navdrawtest.classes.Person;


public class ListPerson_ViewHolder extends RecyclerView.Adapter<ListPerson_ViewHolder.PersonViewHolder>  {


    private Person[] personArray;
    static ClickListner clickListner;

    public ListPerson_ViewHolder(Person[] pA)
    {
        this.personArray = pA;
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        //LayoutInflater : Instantiates a layout XML file into its corresponding View objects.
        View vw = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_keynotes,parent,false);
        PersonViewHolder personViewHolder = new PersonViewHolder(vw);
        return personViewHolder;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {
        holder.Descrip.setText(personArray[position].get_Description());
        holder.name.setText(personArray[position].get_name());
        //SET IMAGE RESOURCE
        holder.img.setImageResource(personArray[position].get_imageUrl());
    }

    @Override
    public int getItemCount() {
        return personArray.length;
    }

    // inner class to hold a reference to each item of RecyclerView
    public static class PersonViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public CardView cv;
        public TextView Descrip , name,title;
        public ImageView img;

        //construct
        public PersonViewHolder(View itemView) {
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.cv);
            cv.setPadding(0,0,0,15);
            Descrip = (TextView) itemView.findViewById(R.id.descrip);
            name = (TextView) itemView.findViewById(R.id.name);
            img = (ImageView) itemView.findViewById(R.id.image_item);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {


            if(clickListner!= null)
            {
                clickListner.itemClicked(v,getPosition());
            }
        }
    }

    public interface  ClickListner{
        public void itemClicked(View v , int Position);
    }

    public void setClickListner(ListPerson_ViewHolder.ClickListner clickListner)
    {
        this.clickListner = clickListner;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }




}
