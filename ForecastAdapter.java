package com.example.android.sunshine;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
/**
 * Created by tgejason on 3/21/2018.
 */
// TODO c(15) Add a class file called ForecastAdapter
// TODO c(22) Extend RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder>

// TODO c(23) Create a private string array called mWeatherData

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder>{
    private String mWeatherData[];

   public class ForecastAdapterViewHolder extends RecyclerView.ViewHolder {

       // Within ForecastAdapterViewHolder ///////////////////////////////////////////////////////////
       // TODO c(16) Create a class within ForecastAdapter called ForecastAdapterViewHolder
       // TODO c(17) Extend RecyclerView.ViewHolder
       // TODO c(18) Create a public final TextView variable called mWeatherTextView

       // TODO c(19) Create a constructor for this class that accepts a View as a parameter
       // TODO c(20) Call super(view) within the constructor for ForecastAdapterViewHolder
       // TODO c(21) Using view.findViewById, get a reference to this layout's TextView and save it to mWeatherTextView
       // Within ForecastAdapterViewHolder ///////////////////////////////////////////////////////////
    public final TextView mWeatherTextView;

    public ForecastAdapterViewHolder(View view){
        super(view);
    mWeatherTextView = (TextView) view.findViewById(R.id.tv_weather_data);
   }
}


// Within ForecastAdapter.java /////////////////////////////////////////////////////////////////


// TODO (47) Create the default constructor (we will pass in parameters in a later lesson)



// TODO (24) Override onCreateViewHolder
// TODO (25) Within onCreateViewHolder, inflate the list item xml into a view
// TODO (26) Within onCreateViewHolder, return a new ForecastAdapterViewHolder with the above view passed in as a parameter
    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType){
        Context context = viewGroup.getContext();
        int layoutIdForListItem = R.layout.forecast_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, viewGroup, shouldAttachToParentImmediately);
        return new ForecastAdapterViewHolder(view);
   }

    // TODO c(27) Override onBindViewHolder
    // TODO c(28) Set the text of the TextView to the weather for this list item's position
    @Override
    public void onBindViewHolder(ForecastAdapterViewHolder forecastAdapterViewHolder, int position){
        String weatherForThisDay = mWeatherData[position];
        forecastAdapterViewHolder.mWeatherTextView.setText(weatherForThisDay);
    }

    // TODO c(29) Override getItemCount
    // TODO c(30) Return 0 if mWeatherData is null, or the size of mWeatherData if it is not null
    @Override
    public int getItemCount(){
        if (null == mWeatherData) return 0;
        return mWeatherData.length;
    }

    // TODO c(31) Create a setWeatherData method that saves the weatherData to mWeatherData
    // TODO c(32) After you save mWeatherData, call notifyDataSetChanged
    // Within ForecastAdapter.java /////////////////////////////////////////////////////////////////

    public void setWeatherData(String[] weatherData){
        mWeatherData = weatherData;
        notifyDataSetChanged();
    }
}




