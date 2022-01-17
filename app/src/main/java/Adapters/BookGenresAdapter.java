package Adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.livreambiance.R;

import java.util.ArrayList;

public class BookGenresAdapter extends RecyclerView.Adapter<BookGenresAdapter.BookGenreViewHolder> {

    Context mContext;
    ArrayList<String> dataForBookGenres,dataForBookGenreIcon;

    public BookGenresAdapter(Context mContext, ArrayList<String> dataForBookGenres,ArrayList<String> dataForBookGenreIcon) {

        this.mContext = mContext;
        this.dataForBookGenres = dataForBookGenres;
        this.dataForBookGenreIcon = dataForBookGenreIcon;
    }

    @NonNull
    @Override
    public BookGenreViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_for_book_genre_items,parent,false);
        return new BookGenreViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookGenreViewHolder holder, int position) {

        holder.genreNameTv.setText(dataForBookGenres.get(position));

        Glide.with(mContext).load(dataForBookGenreIcon.get(position)).into(holder.genreIconIv);
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return dataForBookGenres.size();
    }

    class BookGenreViewHolder extends RecyclerView.ViewHolder{

        ImageView genreIconIv;
        TextView genreNameTv;

        public BookGenreViewHolder(@NonNull View itemView) {
            super(itemView);

            genreIconIv = itemView.findViewById(R.id.iVGenreIcon);
            genreNameTv = itemView.findViewById(R.id.tVGenreName);
        }
    }
}
