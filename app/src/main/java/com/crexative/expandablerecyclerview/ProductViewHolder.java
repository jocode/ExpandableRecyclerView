package com.crexative.expandablerecyclerview;

import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

public class ProductViewHolder extends ChildViewHolder {

    private TextView tvProduct;

    public ProductViewHolder(View itemView) {
        super(itemView);
        tvProduct = itemView.findViewById(R.id.tvProduct);
    }

    public void bind(Product product){
        tvProduct.setText(product.name);
    }

}
