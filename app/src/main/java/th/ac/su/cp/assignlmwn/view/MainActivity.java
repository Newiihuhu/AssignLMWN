package th.ac.su.cp.assignlmwn.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import th.ac.su.cp.assignlmwn.R;
import th.ac.su.cp.assignlmwn.model.api.ApiService;
import th.ac.su.cp.assignlmwn.model.item.Item;
import th.ac.su.cp.assignlmwn.viewmodel.ItemAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Set id with RecyclerView
        RecyclerView mRecyclerView = findViewById(R.id.recyclerView);
        //Create LinearLayout
        mRecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        //Build retrofit
        Retrofit ret = new Retrofit.Builder()
                .baseUrl("https://api.coinranking.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiService apiService = ret.create(ApiService.class);
        //Call ApiService
        Call<Item> call = apiService.getData();
        call.enqueue(new Callback<Item>() {
            @Override
            public void onResponse(Call<Item> call, Response<Item> response) {
                //response
                if(response.isSuccessful()){
                    Item item = response.body();
                    //send list to adapter
                    ItemAdapter adapter = new ItemAdapter(MainActivity.this,item);
                    mRecyclerView.setAdapter(adapter);
                }
            }
            @Override
            public void onFailure(Call<Item> call, Throwable t) {
                //check error
                Log.e("API",t.toString());
            }
        });

    }
}