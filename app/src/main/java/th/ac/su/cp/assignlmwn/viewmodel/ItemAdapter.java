package th.ac.su.cp.assignlmwn.viewmodel;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.github.twocoffeesoneteam.glidetovectoryou.GlideApp;
import com.github.twocoffeesoneteam.glidetovectoryou.GlideToVectorYou;

import java.util.List;

import th.ac.su.cp.assignlmwn.R;
import th.ac.su.cp.assignlmwn.model.item.Coins;
import th.ac.su.cp.assignlmwn.model.item.Item;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.MyViewHolder> {
    private Context mContext;
    private static Item items;
    public ItemAdapter(Context mContext, Item items){
        this.mContext = mContext;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list,parent,false);
        return new MyViewHolder(v);
    }

    //holder item on recycler view
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        List<Coins> coins = items.getData().getCoins();
        holder.nameTV.setText(coins.get(position).getName());
        holder.descriptTV.setText(coins.get(position).getDescription());

        String pathUrl = coins.get(position).getIconUrl();
        Uri uri = Uri.parse(pathUrl);
        if(pathUrl.endsWith("svg")){
            GlideToVectorYou.init().with(mContext).load(uri,holder.iconIV);
        }else{
            GlideApp.with(mContext).load(pathUrl).into(holder.iconIV);
        }
    }

    //set size of recycler view
    @Override
    public int getItemCount() {
        return items.getData().getCoins().size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView nameTV;
        TextView descriptTV;
        ImageView iconIV;
        public MyViewHolder(View itemView){
            super(itemView);
            nameTV = itemView.findViewById(R.id.name_textView);
            descriptTV = itemView.findViewById(R.id.descript_textView);
            iconIV = itemView.findViewById(R.id.icon_imageView);
        }
    }

}
