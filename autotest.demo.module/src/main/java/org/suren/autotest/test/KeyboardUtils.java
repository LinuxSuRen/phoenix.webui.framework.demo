package org.suren.autotest.test;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * @author suren
 */
public class KeyboardUtils
{
    public static void cancel() throws AWTException
    {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CANCEL);
        robot.keyRelease(KeyEvent.VK_CANCEL);
    }
}
