adb shell am start -W -a android.intent.action.VIEW -d "navapp://deeplink" k.studio.test_navigation

adb shell am start -W -a android.intent.action.VIEW -d "https://example.com/user/Profile%202/details"
adb shell am start -W -a android.intent.action.VIEW -d "https://www.example.com/user/Profile%202/details"
adb shell am start -W -a android.intent.action.VIEW -d "https://www.example.com/user/Profile%202"
adb shell am start -W -a android.intent.action.VIEW -d "https://www.example.com/leaderboard/common"
adb shell am start -W -a android.intent.action.VIEW -d "https://www.example.com/register/common"
adb shell am start -W -a android.intent.action.VIEW -d "https://www.example.com/leaderboard"
adb shell am start -W -a android.intent.action.VIEW -d "https://www.example.com/register"

adb shell am start -W -a android.intent.action.VIEW -d "https://www.example.com/leaderboard/test%20leaderboard/common"
adb shell am start -W -a android.intent.action.VIEW -d "https://www.example.com/register/test%20register/common"

adb shell am start -W -a android.intent.action.VIEW -d "https://www.example.com/user/Profile%202/details"



/Users/dev/Library/Android/sdk
$HOME/Library/Android/sdk/platform-tools

export PATH=$PATH: $HOME/Library/Android/sdk/platform-tools/


echo 'export ANDROID_HOME=$HOME/Library/Android/sdk' >> ~/.bash_profile
echo 'export PATH="$PATH:$ANDROID_HOME/tools:$ANDROID_HOME/platform-tools"' >> ~/.bash_profile
source ~/.bash_profile
