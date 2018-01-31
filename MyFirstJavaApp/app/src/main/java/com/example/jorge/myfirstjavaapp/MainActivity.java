package com.example.jorge.myfirstjavaapp;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import com.microsoft.appcenter.AppCenter;
        import com.microsoft.appcenter.analytics.Analytics;
        import com.microsoft.appcenter.crashes.Crashes;
        import com.microsoft.appcenter.AppCenter; import com.microsoft.appcenter.analytics.Analytics; import com.microsoft.appcenter.crashes.Crashes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCenter.start(getApplication(), "548bd1bb-f5d2-4209-aa1f-5d962745dfab",
                Analytics.class, Crashes.class);
        AppCenter.start(getApplication(), "548bd1bb-f5d2-4209-aa1f-5d962745dfab", Analytics.class, Crashes.class);
    }
}
