package com.erdemtsynduev.profitcoin.widget;

import android.content.Intent;
import android.widget.RemoteViewsService;

/**
 * WidgetService is the {@link RemoteViewsService} that will return our RemoteViewsFactory
 */
public class WidgetService extends RemoteViewsService {

    @Override
    public RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new ListRemoteViewsFactory(this);
    }
}