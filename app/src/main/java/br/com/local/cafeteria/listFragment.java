package br.com.local.cafeteria;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class listFragment extends Fragment {
    RecyclerView ltscoffe;
    List<Coffe> coffe;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        coffe = new ArrayList<>();

        coffe.add(new Coffe("Cafe com canela", "coffe tradicional", R.drawable.cafe));
        coffe.add(new Coffe("cappuccino.", "O cappuccino é uma deliciosa invenção italiana, que mistura o café espresso com leite vaporizado, resultando em um creme bem consistente.", R.drawable.cafe));
        coffe.add(new Coffe("cappuccino.", "O cappuccino é uma deliciosa invenção italiana, que mistura o café espresso com leite vaporizado, resultando em um creme bem consistente.", R.drawable.cafe));
        coffe.add(new Coffe("cappuccino.", "O cappuccino é uma deliciosa invenção italiana, que mistura o café espresso com leite vaporizado, resultando em um creme bem consistente.", R.drawable.cafe));
        coffe.add(new Coffe("cappuccino.", "O cappuccino é uma deliciosa invenção italiana, que mistura o café espresso com leite vaporizado, resultando em um creme bem consistente.", R.drawable.cafe));
        coffe.add(new Coffe("cappuccino.", "O cappuccino é uma deliciosa invenção italiana, que mistura o café espresso com leite vaporizado, resultando em um creme bem consistente.", R.drawable.cafe));
        coffe.add(new Coffe("cappuccino. ", "O cappuccino é uma deliciosa invenção italiana, que mistura o café espresso com leite vaporizado, resultando em um creme bem consistente.", R.drawable.cafe));
        coffe.add(new Coffe("cappuccino.", "O cappuccino é uma deliciosa invenção italiana, que mistura o café espresso com leite vaporizado, resultando em um creme bem consistente.", R.drawable.cafe));
        coffe.add(new Coffe("cappuccino.", "O cappuccino é uma deliciosa invenção italiana, que mistura o café espresso com leite vaporizado, resultando em um creme bem consistente.", R.drawable.cafe));
        coffe.add(new Coffe("cappuccino.", "O cappuccino é uma deliciosa invenção italiana, que mistura o café espresso com leite vaporizado, resultando em um creme bem consistente.", R.drawable.cafe));
        coffe.add(new Coffe("cappuccino.", "O cappuccino é uma deliciosa invenção italiana, que mistura o café espresso com leite vaporizado, resultando em um creme bem consistente.", R.drawable.cafe));


    CoffeAdapter coffeAdapter = new CoffeAdapter(getActivity(),coffe);

    ltscoffe = ltscoffe.findViewById(R.id.recycler_view);

    ltscoffe.setLayoutManager(new GridLayoutManager(getActivity(),2));

    ltscoffe.hasFixedSize();

   ltscoffe.setAdapter(coffeAdapter);

        return view;

    }
}
