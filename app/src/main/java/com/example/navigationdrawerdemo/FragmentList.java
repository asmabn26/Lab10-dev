package com.example.navigationdrawerdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

public class FragmentList extends ListFragment {

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        String[] modules = {
                "Accueil de l'application",
                "Navigation par fragments",
                "Menu latéral personnalisé",
                "Gestion du contenu dynamique",
                "Interface XML",
                "FragmentManager",
                "ListFragment",
                "Design personnalisé",
                "Test sur émulateur",
                "Validation du Lab 10"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                requireActivity(),
                android.R.layout.simple_list_item_1,
                modules
        );

        setListAdapter(adapter);
    }
}