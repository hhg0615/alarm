# alarm

2019년2월6일 
내 휴대폰의 액정이 고장났다 
내일 출근해야하는데 알람이 필요했다 
물론 가족의 휴대폰을 이용해 알람을 쓸 수도 있었지만 이번 긴 연휴동안 게임만 했던지라 후회스러운 기분과 함께 이 알람을 만들기로 했다

첫번째
alarmTimer라는 폴더에 있는 프로젝트는 쓰레드를 이용해 YYYYMMDDHHmm형식의 날짜 및 시간을 입력받으면 그시간들을 쪼개고 현재시간의 시간과의 차이를 구해서 타이머같이 이용하는 알람이다

두번째
alarm이라는 폴더에 있는 프로젝트는 YYYYMMDDHHmm형식의 날짜 및 시간을 입력받으면 스레드가 1마다 현재 시간을 체크하여 입력받은 날짜와 같으면 알람을울리는 방식의 알람이다

첫번째 alarmTimer는 입력한시간으로부터의 정확한 밀리세컨즈까지 세기 때문에 스톱워치나 타이머 쪽의 기능을 하고 두번째 alarm은 입력한 시간이 딱 되면(밀리세컨즈까지 세지않아 입력한 시간의 분이 되면 울림) 알람이 울리기 때문에 좀 더 아침에 일어나기위한 알람의 기능을 갖고있다.  
