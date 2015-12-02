package app.ieee.ma.emsi.navdrawtest.viewHolder_class;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import app.ieee.ma.emsi.navdrawtest.R;
import app.ieee.ma.emsi.navdrawtest.classes.Commitee;


public class CallForPaper_ViewHolder  extends RecyclerView.Adapter<CallForPaper_ViewHolder.CFPViewHolder> {

    private Commitee[]  ArrayCallForPapers;

    public CallForPaper_ViewHolder(Commitee[] arrayCallForPapers) {
        ArrayCallForPapers = arrayCallForPapers;
    }

    @Override
    public CFPViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View vw = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_commitee,parent,false);
        CFPViewHolder listCFP = new CFPViewHolder(vw);
        return listCFP;
    }

    @Override
    public void onBindViewHolder(CFPViewHolder holder, int position) {

        holder.TitleItem.setText(ArrayCallForPapers[position].getTitle());
        holder.DescripItem.setText(ArrayCallForPapers[position].getDescription());

    }

    @Override
    public int getItemCount() {
        return ArrayCallForPapers.length;
    }

    public static class CFPViewHolder extends RecyclerView.ViewHolder
    {
        TextView TitleItem , DescripItem;
        CardView items;

        public CFPViewHolder(View itemView) {
            super(itemView);
            TitleItem = (TextView) itemView.findViewById(R.id.titleItem);
            DescripItem = (TextView) itemView.findViewById(R.id.descItem);
            items = (CardView) itemView.findViewById(R.id.cv_committee);
        }
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
