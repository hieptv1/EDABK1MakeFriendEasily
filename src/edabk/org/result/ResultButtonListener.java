/* using com.google.zing package to decode QR code*/
package edabk.org.result;

import android.view.View;
import android.widget.Button;

/**
 * Handles the result of barcode decoding in the context of the Android platform, by dispatching the
 * proper intents to open other activities like GMail, Maps, etc.
 
 */
public final class ResultButtonListener implements Button.OnClickListener {
  private final ResultHandler resultHandler;
  private final int index;

  public ResultButtonListener(ResultHandler resultHandler, int index) {
    this.resultHandler = resultHandler;
    this.index = index;
  }

  public void onClick(View view) {
    resultHandler.handleButtonPress(index);
  }
}
