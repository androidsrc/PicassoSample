package com.androidsrc.picassoapplication;

import java.io.File;

import com.squareup.picasso.Picasso;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends Activity {

	ImageView networkImage;
	ImageView appResourceImage;
	ImageView localFileImage;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		networkImage = (ImageView)findViewById(R.id.networkImage);
		appResourceImage = (ImageView)findViewById(R.id.appResourceImage);
		localFileImage = (ImageView)findViewById(R.id.localFileImage);
		
		setImagesUsingPicasso();
	}

	private void setImagesUsingPicasso() {
		//Set network Image
		Picasso.with(this).load("http://androidsrc.net/samples/images/AndroidSRC_SampleImage_1.png").fit().into(networkImage);
		//Load from app resource
		Picasso.with(this).load(R.drawable.app_resource).fit().into(appResourceImage);
		//Load from local file
		Picasso.with(this).load(new File("sdcard/picasso_demo_image.png")).fit().error(R.drawable.ic_launcher).into(localFileImage);
		
	}

}
