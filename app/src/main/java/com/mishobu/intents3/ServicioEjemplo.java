package com.mishobu.intents3;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by Roberto Salazar on 22/09/2015.
 *
 * @version 1.0
 */
public class ServicioEjemplo extends Service {

    @Override
    public void onDestroy() {
        Toast.makeText(ServicioEjemplo.this, "Servicio Terminado", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this,"Servicio Creado",Toast.LENGTH_SHORT).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(ServicioEjemplo.this, "Tarea realizada por el servicio", Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);

    }
}
