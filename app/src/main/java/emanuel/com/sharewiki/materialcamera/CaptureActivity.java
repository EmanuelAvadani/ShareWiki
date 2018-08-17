package emanuel.com.sharewiki.materialcamera;

import android.app.Fragment;
import android.support.annotation.NonNull;

import emanuel.com.sharewiki.materialcamera.internal.BaseCaptureActivity;
import emanuel.com.sharewiki.materialcamera.internal.CameraFragment;

public class CaptureActivity extends BaseCaptureActivity {

  @Override
  @NonNull
  public Fragment getFragment() {
    return CameraFragment.newInstance();
  }
}
