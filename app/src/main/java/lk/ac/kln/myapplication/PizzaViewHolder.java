package lk.ac.kln.myapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class PizzaViewHolder extends RecyclerView.ViewHolder {
    RelativeLayout relativeLayout;
    TextView textView;
    public PizzaViewHolder(@NonNull View itemView)
    {
        super (itemView);
        relativeLayout = itemView.findViewById(R.id.listItem);
        textView = itemView.findViewById(R.id.textView);
    }
}
