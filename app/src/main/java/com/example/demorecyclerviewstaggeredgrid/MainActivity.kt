package com.example.demorecyclerviewstaggeredgrid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {

    // on below line we are creating variables for
    // our swipe to refresh layout,
    // recycler view, adapter and list.
    lateinit var photoRV: RecyclerView
    lateinit var photoRVAdapter: PhotoRVAdapter
    lateinit var dataList: ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // on below line we are initializing
        // our views with their ids.
        photoRV = findViewById(R.id.idRVPhotos)
//        photoRV.setHasFixedSize(true)

        // on below line we are
        // initializing our list
        dataList = ArrayList()

        // on below line we are initializing our adapter
        photoRVAdapter = PhotoRVAdapter(dataList)



        // on below line we are setting layout manager for our recycler view
        val staggeredGridLayoutManager = StaggeredGridLayoutManager(3, LinearLayoutManager.HORIZONTAL)
        photoRV.layoutManager = staggeredGridLayoutManager

        // on below line we are setting
        // adapter to our recycler view.
        photoRV.adapter = photoRVAdapter

        // on below line we are adding data to our list
        dataList.add("Banking")
        dataList.add("IT")
        dataList.add("Textile")
        dataList.add("Food")
        dataList.add("Ceramic")
        dataList.add("Sectors")
        dataList.add("Xyz")
        dataList.add("Pop")


        dataList.add("Banking Sector staggered grid layout manager datalist textile adapter")
        dataList.add("IT")
        dataList.add("Textile")
        dataList.add("Food")
        dataList.add("Ceramic")
        dataList.add("Sectors")
        dataList.add("Xyz")
        dataList.add("Pop")


        // on below line we are notifying adapter
        // that data has been updated.
        photoRVAdapter.notifyDataSetChanged()

    }
}