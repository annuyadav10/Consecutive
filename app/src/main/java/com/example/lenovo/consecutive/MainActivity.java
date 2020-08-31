package com.example.lenovo.consecutive;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     int[] array={0,0,1,1,0,0,1,1,0};
     TextView textView;
      int number=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          textView=findViewById(R.id.result);
          number =maxOnes(array);
          textView.setText("Maximum Consecutive is :  "+number);
    }
    public static int maxOnes(int[] arr){
        int count = 0;
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0)
                count = 0;
            else
                count++;
            max = count > max ? count : max;
        }
        return max;
    }
}