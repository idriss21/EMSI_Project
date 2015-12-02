package app.ieee.ma.emsi.navdrawtest.viewHolder_class;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import app.ieee.ma.emsi.navdrawtest.R;
import app.ieee.ma.emsi.navdrawtest.classes.Commitee;

import static android.support.v7.widget.RecyclerView.ViewHolder;


public class ListCommitee_ViewHolder extends RecyclerView.Adapter<ListCommitee_ViewHolder.CommiteeViewHolder> {

    private Commitee[]  ArrayCommitee;

    public ListCommitee_ViewHolder(Commitee[] commitee) {
        ArrayCommitee = commitee;
    }

    public static class CommiteeViewHolder extends ViewHolder  {

        TextView TitleItem , DescripItem;
        CardView items;


        public CommiteeViewHolder(View itemView) {
            super(itemView);

            TitleItem = (TextView) itemView.findViewById(R.id.titleItem);
            DescripItem = (TextView) itemView.findViewById(R.id.descItem);
            items = (CardView) itemView.findViewById(R.id.cv_committee);


        }

    }

    @Override
    public CommiteeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View vw = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_commitee,parent,false);
        CommiteeViewHolder listCommitee = new CommiteeViewHolder(vw);
        return listCommitee;

    }

    @Override
    public void onBindViewHolder(CommiteeViewHolder holder, int position) {

        holder.TitleItem.setText(ArrayCommitee[position].getTitle());
        holder.DescripItem.setText(ArrayCommitee[position].getDescription());
    }




    @Override
    public int getItemCount() {
        return ArrayCommitee.length;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }


}
