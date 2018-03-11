package com.edimariyanto491.idn_workshop;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.edimariyanto491.idn_workshop.databinding.ActivityDataBindingBinding;
import com.edimariyanto491.idn_workshop.model.Peserta;

public class DataBinding extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDataBindingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding);
        Peserta p = new Peserta("Edi","30","jakarta");
        binding.setPesertas(p);

    }
}
