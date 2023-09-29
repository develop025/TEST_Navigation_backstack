adb shell am start -W -a android.intent.action.VIEW -d "navapp://deeplink" k.studio.test_navigation

adb shell am start -W -a android.intent.action.VIEW -d "https://example.com/user/Profile%202/details"
adb shell am start -W -a android.intent.action.VIEW -d "https://www.example.com/user/Profile%202/details"
adb shell am start -W -a android.intent.action.VIEW -d "https://www.example.com/user/Profile%202"


/Users/dev/Library/Android/sdk
$HOME/Library/Android/sdk/platform-tools

export PATH=$PATH: $HOME/Library/Android/sdk/platform-tools/


echo 'export ANDROID_HOME=$HOME/Library/Android/sdk' >> ~/.bash_profile
echo 'export PATH="$PATH:$ANDROID_HOME/tools:$ANDROID_HOME/platform-tools"' >> ~/.bash_profile
source ~/.bash_profile
