package com.example.recyclevapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recyclevapp.DataModel;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class BottomSheetFragment extends BottomSheetDialogFragment {

    private DataModel dataModel;

    public BottomSheetFragment(DataModel dataModel) {
        this.dataModel = dataModel;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bottom_sheet, container, false);

        TextView title = view.findViewById(R.id.fragment_bottom_title);
        TextView description = view.findViewById(R.id.fragment_bottom_description);
        ImageView image = view.findViewById(R.id.fragment_bottom_image);

        title.setText(dataModel.getName());
        description.setText(dataModel.getVersion());
        image.setImageResource(dataModel.getImage());

        return view;
    }
}
