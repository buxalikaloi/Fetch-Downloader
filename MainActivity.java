package com.fetchdownloader.me;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
	Button downloadBtn;
	EditText urlEditTxt, fileNameEditTxt;
	String url, fileName;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		downloadBtn = findViewById(R.id.downloadBtn);
		urlEditTxt = findViewById(R.id.urlEditTxt);
		fileNameEditTxt = findViewById(R.id.fileNameEditTxt);

		downloadBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				url = urlEditTxt.getText().toString();
				fileName = fileNameEditTxt.getText().toString();
				//	String urlAndName = url + "@bg" + fileName;
				Intent intent = new Intent(MainActivity.this, DownloadListActivity.class);
				//	intent.putExtra("fileName", fileName);
				Data.sampleUrls = new String[] { url };
				startActivity(intent);
			}
		});
	}
}