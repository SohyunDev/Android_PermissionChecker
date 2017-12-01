package com.example.sohyun_mac.permissionchecker;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private final int REQUEST_PERMISSION_CODE=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkPermission();

    }
    private void checkPermission(){
        final String[] permissionNames = {"android.permission.BATTERY_STATS", "android.permission.CALL_PHONE","android.permission.CAMERA"
                ,"android.permission.ACCESS_NETWORK_STATE", "android.permission.CHANGE_NETWORK_STATE","android.permission.ACCESS_WIFI_STATE"
                ,"android.permission.CHANGE_WIFI_STATE", "android.permission.READ_CALENDAR", "android.permission.READ_CONTACTS"
                ,"android.permission.READ_SMS"};
        ActivityCompat.requestPermissions(this, permissionNames, REQUEST_PERMISSION_CODE);
        for(int index =0; index< permissionNames.length; index++) {
            makeAlert(permissionNames[index].split("\\.")[2]);
        }
    }

    private void makeAlert(String permissionName){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("PERMISSION");
        final String messageText = " 권한을 받았습니다.";
        String message = permissionName +messageText;
        builder.setMessage(message);
        builder.setCancelable(true);
        builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

}
