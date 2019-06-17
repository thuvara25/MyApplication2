package lk.ac.kln.myapplication;

import android.app.LauncherActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PizzaListAdapter extends RecyclerView.Adapter<PizzaViewHolder> {
    private String pizzaDetails[]= {"Pizza_one","Pizza_two","Pizza_three"};

    @Override
    public  PizzaViewHolder onCreateViewHolder(ViewGroup viewGroup,int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext())
                View listItem = layoutInflater.inflate(R.layout.list,viewGroup, false);
        PizzaViewHolder vh = new PizzaViewHolder(listItem);
        return vh;
    }

    @Override
    public void onBuildViewHolder(PizzaViewHolder holder, final int position){
        holder.textView.setText(pizzaDetails[position]);


    }
    @Override
}
}
