package at.abraxas.amarino.plugin.skeleton;

import at.abraxas.amarino.plugin.PluginReceiver;

public class MyPluginReceiver extends PluginReceiver {

	public MyPluginReceiver() {
		// TODO change name of your background service class if necessary
		serviceClass = MyBackgroundService.class;
	}
}
