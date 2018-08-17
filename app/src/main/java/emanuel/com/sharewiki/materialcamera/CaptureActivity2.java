package emanuel.com.sharewiki.materialcamera;

import android.app.Fragment;
import android.support.annotation.NonNull;

import emanuel.com.sharewiki.materialcamera.internal.BaseCaptureActivity;
import emanuel.com.sharewiki.materialcamera.internal.Camera2Fragment;


public class CaptureActivity2 extends BaseCaptureActivity {

  @Override
  @NonNull
  public Fragment getFragment() {
    return Camera2Fragment.newInstance();
  }
}
