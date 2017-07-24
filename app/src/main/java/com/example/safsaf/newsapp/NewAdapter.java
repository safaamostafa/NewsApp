package com.example.safsaf.newsapp;

/**
 * Created by Safsaf on 7/22/2017.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
  * An {@link NewAdapter} knows how to create a list item layout for each new
  * in the data source (a list of {@link New} objects).
  * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class NewAdapter extends ArrayAdapter<New> {

    /**
         * Constructs a new {@link NewAdapter}.
          *
        * @param context of the app
         * @param news is the list of news, which is the data source of the adapter
     */
    public NewAdapter(Context context, List<New> news) {
        super(context, 0, news);
    }

    /**
         * Returns a list item view that displays information about the new at the given position
        * in the list of news.

     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.new_list_item, parent, false);
        }

        // Find the new at the given position in the list of news
        New currentNew = getItem(position);

        // Find the TextView with view ID title
        TextView titleView = (TextView) listItemView.findViewById(R.id.title);
        // Display the title of the current new in that TextView
        titleView.setText(currentNew.getTitle());

        // Find the TextView with view ID author
        TextView authorView = (TextView) listItemView.findViewById(R.id.author);
        // Display the author of the current new in that TextView
        authorView.setText(currentNew.getAuthor());

        // Find the TextView with view ID publishedAt
        TextView publishedAtView = (TextView) listItemView.findViewById(R.id.publishedAt);
        // Display the date of the current new in that TextView
        publishedAtView.setText(currentNew.getPublishedAt());

        // Find the TextView with view ID description
        TextView descriptionView = (TextView) listItemView.findViewById(R.id.description);
        // Display the date of the current new in that TextView
        descriptionView.setText(currentNew.getDescription());


        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }
}