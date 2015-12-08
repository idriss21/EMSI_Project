package app.ieee.ma.emsi.navdrawtest.viewHolder_class;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import app.ieee.ma.emsi.navdrawtest.R;
import app.ieee.ma.emsi.navdrawtest.classes.Planing;

/**
 * Created by idriss on 28/11/2015.
 */
public class Planing_ViewHolder  extends RecyclerView.Adapter<Planing_ViewHolder.PlaningViewHolder> {

    private Planing[] ListPlaning;

    public Planing_ViewHolder(Planing[] listPlaning) {
        ListPlaning = listPlaning;
    }

    @Override
    public PlaningViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View vw = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_planing,parent,false);
        PlaningViewHolder listCFP = new PlaningViewHolder(vw);
        return listCFP;
    }

    @Override
    public void onBindViewHolder(PlaningViewHolder holder, int position) {
        holder.time.setText(ListPlaning[position].getTime());
        holder.description.setText(ListPlaning[position].getDescription());
        holder.location.setText(ListPlaning[position].getLocation());
    }


    @Override
    public int getItemCount() {
        return ListPlaning.length;
    }



    public static class PlaningViewHolder extends RecyclerView.ViewHolder
    {
        TextView time , description , location;
        CardView items;

        public PlaningViewHolder(View itemView) {
            super(itemView);

            time = (TextView) itemView.findViewById(R.id.dateItem);
            description = (TextView) itemView.findViewById(R.id.titleItem);
            location = (TextView) itemView.findViewById(R.id.location);
            items = (CardView) itemView.findViewById(R.id.cv_planing);
        }
    }
}
