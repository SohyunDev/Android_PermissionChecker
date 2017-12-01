1. AndroidManifest.xml에 permission들을 10개 추가

    <uses-permission android:name="android.permission.BATTERY_STATS" />
    <uses-permission android:name="android.permission.CALL_PHONE" />
    <uses-permission android:name="android.permission.CAMERA" />
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
    <uses-permission android:name="android.permission.CHANGE_NETWORK_STATE" />
    <uses-permission android:name="android.permission.ACCESS_WIFI_STATE" />
    <uses-permission android:name="android.permission.CHANGE_WIFI_STATE" />
    <uses-permission android:name="android.permission.READ_CALENDAR" />
    <uses-permission android:name="android.permission.READ_CONTACTS" />
    <uses-permission android:name="android.permission.READ_SMS" />

2. Permission을 받아왔는지 체크한다.

3. Permission을 받아오지 못했을 경우 Request한다. (API 23이후 필요)

4. Permission을 받으면 받은 Permission들을 AlertDialog를 사용하여 출력한다.