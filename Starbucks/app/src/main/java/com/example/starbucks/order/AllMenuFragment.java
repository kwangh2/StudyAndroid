package com.example.starbucks.order;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.starbucks.R;
import com.example.starbucks.databinding.FragmentAllMenuBinding;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;


public class AllMenuFragment extends Fragment {
    FragmentAllMenuBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAllMenuBinding.inflate(inflater,container,false);
        AllMenuAdapter adapter = new AllMenuAdapter(inflater,addcategory(),getContext());
        binding.rcyvBeverage.setAdapter(adapter);
        binding.rcyvBeverage.setLayoutManager(new LinearLayoutManager(getContext()));

        TabLayout tabLayout = (TabLayout)binding.tl;
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                if(position ==0 ){
                    AllMenuAdapter adapter = new AllMenuAdapter(inflater,addcategory(),getContext());
                    binding.rcyvBeverage.setAdapter(adapter);
                    binding.rcyvBeverage.setLayoutManager(new LinearLayoutManager(getContext()));
                } else if(position ==1) {
                    AllMenuAdapter adapter = new AllMenuAdapter(inflater,addfood(),getContext());
                    binding.rcyvBeverage.setAdapter(adapter);
                    binding.rcyvBeverage.setLayoutManager(new LinearLayoutManager(getContext()));
                }else if(position ==2){
                    AllMenuAdapter adapter = new AllMenuAdapter(inflater,addgoods(),getContext());
                    binding.rcyvBeverage.setAdapter(adapter);
                    binding.rcyvBeverage.setLayoutManager(new LinearLayoutManager(getContext()));
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        return binding.getRoot();
    }


    public List<BeverageCategoryDTO> addcategory(){
        List<BeverageCategoryDTO> list = new ArrayList<>();
        list.add(new BeverageCategoryDTO("Trenta" , "" , R.drawable.img_trenta));
        list.add(new BeverageCategoryDTO("New" , "" , R.drawable.img_new));
        list.add(new BeverageCategoryDTO("추천" , "recommend" , R.drawable.menu_star));
        list.add(new BeverageCategoryDTO("피지오" , "Starbucks Fizzio" , R.drawable.img_fizzio));
        list.add(new BeverageCategoryDTO("Trenta" , "" , R.drawable.img_trenta));
        list.add(new BeverageCategoryDTO("New" , "" , R.drawable.img_new));
        list.add(new BeverageCategoryDTO("추천" , "recommend" , R.drawable.menu_star));
        list.add(new BeverageCategoryDTO("피지오" , "Starbucks Fizzio" , R.drawable.img_fizzio));
        list.add(new BeverageCategoryDTO("Trenta" , "" , R.drawable.img_trenta));
        list.add(new BeverageCategoryDTO("New" , "" , R.drawable.img_new));
        list.add(new BeverageCategoryDTO("추천" , "recommend" , R.drawable.menu_star));
        list.add(new BeverageCategoryDTO("피지오" , "Starbucks Fizzio" , R.drawable.img_fizzio));
        return list;
    }

    public List<BeverageCategoryDTO> addfood(){
        List<BeverageCategoryDTO> list = new ArrayList<>();
        list.add(new BeverageCategoryDTO("NEW" , "" , R.drawable.img_food_snowman));
        list.add(new BeverageCategoryDTO("추천" , "Recommend" , R.drawable.img_food_ciabatta));
        list.add(new BeverageCategoryDTO("브레드" , "Bread" , R.drawable.img_food_pandoro));
        list.add(new BeverageCategoryDTO("케이크&미니디저트" , "Cake&Mini Dessert" , R.drawable.img_food_snowman));
        list.add(new BeverageCategoryDTO("NEW" , "" , R.drawable.img_food_snowman));
        list.add(new BeverageCategoryDTO("추천" , "Recommend" , R.drawable.img_food_ciabatta));
        list.add(new BeverageCategoryDTO("브레드" , "Bread" , R.drawable.img_food_pandoro));
        list.add(new BeverageCategoryDTO("케이크&미니디저트" , "Cake&Mini Dessert" , R.drawable.img_food_snowman));
        list.add(new BeverageCategoryDTO("NEW" , "" , R.drawable.img_food_snowman));
        list.add(new BeverageCategoryDTO("추천" , "Recommend" , R.drawable.img_food_ciabatta));
        list.add(new BeverageCategoryDTO("브레드" , "Bread" , R.drawable.img_food_pandoro));
        list.add(new BeverageCategoryDTO("케이크&미니디저트" , "Cake&Mini Dessert" , R.drawable.img_food_snowman));
        return list;
    }
    public List<BeverageCategoryDTO> addgoods(){
        List<BeverageCategoryDTO> list = new ArrayList<>();
        list.add(new BeverageCategoryDTO("NEW" , "" , R.drawable.img_good_new));
        list.add(new BeverageCategoryDTO("추천" , "Recommend" , R.drawable.img_goods_recommend));
        list.add(new BeverageCategoryDTO("머그/글라스" , "Mug/Glass" , R.drawable.img_goods_mug));
        list.add(new BeverageCategoryDTO("스테인리스텀블러" , "Stainless steel Tumbler" , R.drawable.img_goods_tumbler));
        list.add(new BeverageCategoryDTO("NEW" , "" , R.drawable.img_good_new));
        list.add(new BeverageCategoryDTO("추천" , "Recommend" , R.drawable.img_goods_recommend));
        list.add(new BeverageCategoryDTO("머그/글라스" , "Mug/Glass" , R.drawable.img_goods_mug));
        list.add(new BeverageCategoryDTO("스테인리스텀블러" , "Stainless steel Tumbler" , R.drawable.img_goods_tumbler));
        list.add(new BeverageCategoryDTO("NEW" , "" , R.drawable.img_good_new));
        list.add(new BeverageCategoryDTO("추천" , "Recommend" , R.drawable.img_goods_recommend));
        list.add(new BeverageCategoryDTO("머그/글라스" , "Mug/Glass" , R.drawable.img_goods_mug));
        list.add(new BeverageCategoryDTO("스테인리스텀블러" , "Stainless steel Tumbler" , R.drawable.img_goods_tumbler));
        return list;
    }
}