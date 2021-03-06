package org.techtown.betweenus_android.widget.recyclerview.viewholder;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import org.techtown.betweenus_android.databinding.PlaceItemBinding;
import org.techtown.betweenus_android.databinding.QrItemBinding;

public class StudyListViewHolder extends RecyclerView.ViewHolder {

    public QrItemBinding binding;

    public StudyListViewHolder(@NonNull View itemView) {
        super(itemView);
        binding = DataBindingUtil.bind(itemView);

        binding.studyTitle.setSelected(true);
    }
}
