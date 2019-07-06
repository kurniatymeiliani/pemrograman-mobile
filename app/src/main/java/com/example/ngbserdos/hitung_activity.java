package com.example.ngbserdos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class hitung_activity extends AppCompatActivity implements View.OnClickListener {
    EditText edtNap, edtNkp, edtNps, edtNbi, edtNpa;
    Button btnCalculate;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_activity);
        edtNap = findViewById(R.id.edt_nap);
        edtNkp = findViewById(R.id.edt_nkp);
        edtNps = findViewById(R.id.edt_nps);
        edtNbi = findViewById(R.id.edt_nbi);
        edtNpa = findViewById(R.id.edt_npa);
        btnCalculate = findViewById(R.id.btn_calculate);
        tvResult = findViewById(R.id.tv_result);
        btnCalculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String ket;
        if (v.getId() == R.id.btn_calculate) {
            String inputNap = edtNap.getText().toString().trim();
            String inputNkp = edtNkp.getText().toString().trim();
            String inputNps = edtNps.getText().toString().trim();
            String inputNbi = edtNbi.getText().toString().trim();
            String inputNpa = edtNpa.getText().toString().trim();

            boolean isEmptyFields = false;
            boolean isInvalidDouble = false;

            if (TextUtils.isEmpty(inputNap)) {
                isEmptyFields = true;
                edtNap.setError("Field ini Tidak Boleh Kosong");
            }
            if (TextUtils.isEmpty(inputNkp)) {
                isEmptyFields = true;
                edtNkp.setError("Field ini Tidak Boleh Kosong");
            }
            if (TextUtils.isEmpty(inputNps)) {
                isEmptyFields = true;
                edtNps.setError("Field ini Tidak Boleh Kosong");
            }
            if (TextUtils.isEmpty(inputNbi)) {
                isEmptyFields = true;
                edtNbi.setError("Field ini Tidak Boleh Kosong");
            }
            if (TextUtils.isEmpty(inputNpa)) {
                isEmptyFields = true;
                edtNpa.setError("Field ini Tidak Boleh Kosong");
            }
            Double nap = Double.parseDouble(inputNap);
            Double nkp = Double.parseDouble(inputNkp);
            Double nps = Double.parseDouble(inputNps);
            Double nbi = Double.parseDouble(inputNbi);
            Double npa = Double.parseDouble(inputNpa);

            if (nap == null) {
                isInvalidDouble = true;
                edtNap.setError("Field ini harus berupa angka");
            }
            if (nkp == null) {
                isInvalidDouble = true;
                edtNkp.setError("Field ini harus berupa angka");
            }
            if (nps == null) {
                isInvalidDouble = true;
                edtNps.setError("Field ini harus berupa angka");
            }
            if (nbi == null) {
                isInvalidDouble = true;
                edtNbi.setError("Field ini harus berupa angka");
            }
            if (npa == null) {
                isInvalidDouble = true;
                edtNpa.setError("Field ini harus berupa angka");
            }
            if (!isEmptyFields && !isInvalidDouble) {
                double jml = nap + nap + nap + nkp + nps + nbi + npa;
                double nbg = jml / 7;
                tvResult.setText(String.valueOf(nbg));
                if (nbg > 4) {
                    ket = "\nAnda Lulus";
                    tvResult.setText(String.valueOf(nbg + ket));
                } else {
                    ket = "\nAnda Belum Lulus";
                    tvResult.setText(String.valueOf(nbg + ket));
                }
            }
        }
    /*Double parseDouble (String str){
        try{
            return Double.valueOf(str);
        }catch (NumberFormatException e){
            return null;
        }
    }*/
    }
}
