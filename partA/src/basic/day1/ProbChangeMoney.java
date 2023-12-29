package basic.day1;

public class ProbChangeMoney {
    
	
	public static void main(String[] args) {

    int myWon=1000000; //여행 경비 (100만원)
    double toYen;      //환전한 엔화 값

    int cost=98760;   //사용한 여행 비용
    int myYen;  //남은 여행 경비
    double towon;  //남은 경비 환전한 원화 값

    double yenTowonRate=9.29; //1엔이 몇 원? 살때
    double wonToYenRate=8.97; //1엔이 몇 원? 팔떄

    myWon=1000000;
    cost=98760;
    toYen = myWon * (double)yenTowonRate;
	myYen = (double)toYen-cost;
    towon = myYen / (double)wonToYenRate;
    
    
    }
    
}
