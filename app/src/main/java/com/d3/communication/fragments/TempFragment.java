/**
 * 
 */
package com.d3.communication.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.d3.communication.d3View.D3Fragment;
import com.d3.communication.d3View.D3View;
import com.d3.communication.R;

/**
 * @author MZH
 *
 */
public class TempFragment extends D3Fragment{
	@D3View TextView test;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.acti_register, null);
	
		return view;
	}
	
	
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.registBtn:
			
			break;

		default:
			break;
		}
	}
}
