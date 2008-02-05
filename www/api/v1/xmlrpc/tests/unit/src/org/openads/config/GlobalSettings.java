/*
+---------------------------------------------------------------------------+
| OpenX v2.5                                                              |
| ============                                                              |
|                                                                           |
| Copyright (c) 2003-2008 m3 Media Services Ltd                             |
| For contact details, see: http://www.openx.org/                           |
|                                                                           |
| This program is free software; you can redistribute it and/or modify      |
| it under the terms of the GNU General Public License as published by      |
| the Free Software Foundation; either version 2 of the License, or         |
| (at your option) any later version.                                       |
|                                                                           |
| This program is distributed in the hope that it will be useful,           |
| but WITHOUT ANY WARRANTY; without even the implied warranty of            |
| MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the             |
| GNU General Public License for more details.                              |
|                                                                           |
| You should have received a copy of the GNU General Public License         |
| along with this program; if not, write to the Free Software               |
| Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA |
+---------------------------------------------------------------------------+
| Copyright (c) 2003-2008 m3 Media Services Ltd                             |
|                                                                           |
|  Licensed under the Apache License, Version 2.0 (the "License");          |
|  you may not use this file except in compliance with the License.         |
|  You may obtain a copy of the License at                                  |
|                                                                           |
|    http://www.apache.org/licenses/LICENSE-2.0                             |
|                                                                           |
|  Unless required by applicable law or agreed to in writing, software      |
|  distributed under the License is distributed on an "AS IS" BASIS,        |
|  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. |
|  See the License for the specific language governing permissions and      |
|  limitations under the License.                                           |
+---------------------------------------------------------------------------+
$Id$
*/

package org.openads.config;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * @author     Andriy Petlyovanyy <apetlyovanyy@lohika.com>
 */
public class GlobalSettings {

	private static final String SERVICE_URL = "ServiceURL";

	private static final String LOGON_SERVICE_LOCATION = "LogonServiceLocation";
	private static final String AGENCY_SERVICE_LOCATION = "AgencyServiceLocation";
	private static final String ADVERTISER_SERVICE_LOCATION = "AdvertiserServiceLocation";
	private static final String BANNER_SERVICE_LOCATION = "BannerServiceLocation";
	private static final String CAMPAIGN_SERVICE_LOCATION = "CampaignServiceLocation";
	private static final String PUBLISHER_SERVICE_LOCATION = "PublisherServiceLocation";
	private static final String ZONE_SERVICE_LOCATION = "ZoneServiceLocation";

	private static final String USER_NAME = "UserName";
	private static final String PASSWORD = "Password";

	private static final String OUTPUT_TO_CONSOLE = "OutputToConsole";
	private static final String LOG_FILE_NAME = "LogFileName";

	private static final String BUNDLE_NAME = "org.openads.config.config"; //$NON-NLS-1$

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle
			.getBundle(BUNDLE_NAME);

	private GlobalSettings() {
	}

	private static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}

	public static String getLogonServiceUrl() {
		return getString(SERVICE_URL) + getString(LOGON_SERVICE_LOCATION);
	}

	public static String getAgencyServiceUrl() {
		return getString(SERVICE_URL) + getString(AGENCY_SERVICE_LOCATION);
	}

	public static String getAdvertiserServiceUrl() {
		return getString(SERVICE_URL) + getString(ADVERTISER_SERVICE_LOCATION);
	}

	public static String getBannerServiceUrl() {
		return getString(SERVICE_URL) + getString(BANNER_SERVICE_LOCATION);
	}

	public static String getCampaignServiceUrl() {
		return getString(SERVICE_URL) + getString(CAMPAIGN_SERVICE_LOCATION);
	}

	public static String getPublisherServiceUrl() {
		return getString(SERVICE_URL) + getString(PUBLISHER_SERVICE_LOCATION);
	}

	public static String getZoneServiceUrl() {
		return getString(SERVICE_URL) + getString(ZONE_SERVICE_LOCATION);
	}

	public static String getUserName() {
		return getString(USER_NAME);
	}

	public static String getPassword() {
		return getString(PASSWORD);
	}

	public static String getOutputToConsole() {
		return getString(OUTPUT_TO_CONSOLE);
	}

	public static String getLogFileName() {
		return getString(LOG_FILE_NAME);
	}
}
