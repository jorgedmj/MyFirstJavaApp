using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Microsoft.AppCenter;
using Microsoft.AppCenter.Analytics;
using Microsoft.AppCenter.Crashes;

using Xamarin.Forms;

namespace App1
{
	public partial class App : Application
	{
		public App ()
		{
			InitializeComponent();

			MainPage = new App1.MainPage();
		}

		protected override void OnStart ()
		{
            AppCenter.Start("android=8080660e-4e4b-4f47-ae13-fe1fdbe6b72e;",
                   typeof(Analytics), typeof(Crashes));
        }

		protected override void OnSleep ()
		{
			// Handle when your app sleeps
		}

		protected override void OnResume ()
		{
			// Handle when your app resumes
		}
	}
}
