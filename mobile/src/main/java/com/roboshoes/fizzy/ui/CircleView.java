package com.roboshoes.fizzy.ui;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.Rational;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.roboshoes.fizzy.R;

public class CircleView extends ImageView {

    private int color;
    private String target;

    public CircleView( Context context, int color, String target, boolean last ) {
        super( context );

        this.color = color;
        this.target = target;

        int margin = last ? 0 : (int) ( context.getResources().getDisplayMetrics().density * 10 );

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );

        params.setMargins( 0, 0, margin, 0 );

        GradientDrawable shape = (GradientDrawable) context.getDrawable( R.drawable.circle );
        shape.setColor( color );

        this.setBackground( shape );
        this.setLayoutParams( params );
    }

    public int getColor() {
        return color;
    }

    public String getTarget() {
        return target;
    }

}
