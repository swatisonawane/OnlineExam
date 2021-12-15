package com.ydcc.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.ydcc.config.BaseClass;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class TestListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("On Test Start");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("On Test Success");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("On test failure");
		AShot ashot = new AShot();
		ShootingStrategy strat = null;
		strat = ShootingStrategies.viewportPasting(2000);
		ashot.shootingStrategy(strat);
		Screenshot sc = ashot.takeScreenshot(BaseClass.driver);
		BufferedImage img = sc.getImage();
		String dir = System.getProperty("user.dir");
		try {
			ImageIO.write(img, "png", new File(dir+ "/Screenshots/"+result.getName()+".png"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("On Test Skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("On Test Failed with in Success Percentage");
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("On Start");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("On finish");
		
	}

}
