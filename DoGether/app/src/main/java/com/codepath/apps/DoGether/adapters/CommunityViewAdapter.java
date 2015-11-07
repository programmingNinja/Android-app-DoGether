package com.codepath.apps.DoGether.adapters;

import android.content.Context;
import android.widget.ArrayAdapter;

import com.codepath.apps.DoGether.models.CommunityView;

import java.util.List;

/**
 * Created by msamant on 11/7/15.
 */
public class CommunityViewAdapter extends ArrayAdapter<CommunityView> {
    public CommunityViewAdapter(Context context, int resource, List<CommunityView> objects) {
        super(context, resource, objects);
    }
}
