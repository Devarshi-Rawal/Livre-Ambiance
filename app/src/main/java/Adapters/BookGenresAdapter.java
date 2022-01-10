package Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.livreambiance.R;

import java.util.ArrayList;

public class BookGenresAdapter extends RecyclerView.Adapter<BookGenresAdapter.BookGenreViewHolder> {

    ArrayList<String> dataForBookGenres;

    public BookGenresAdapter(ArrayList<String> dataForBookGenres) {
        this.dataForBookGenres = dataForBookGenres;
    }

    @NonNull
    @Override
    public BookGenreViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_for_book_genre_items,parent,false);
        return new BookGenreViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookGenreViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class BookGenreViewHolder extends RecyclerView.ViewHolder{

        public BookGenreViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
