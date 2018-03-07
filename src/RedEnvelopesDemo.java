import java.util.ArrayList;
import java.util.List;
/**
 * ΢������������㷨
 * 
 * @author leo-zeng
 *
 */
public class RedEnvelopesDemo {
	/**
	 * 1.�ܽ��ܳ���200*100 ��λ�Ƿ�
	 * 2.ÿ�������Ҫ��Ǯ����Ͳ��ܵ���1�֣������ܳ���200*100
	 */
	private static final int MINMONEY =1;
	private static final int MAXMONEY =200*100;
	/**
	 * ����Ϊ�˱���ĳһ�����ռ�ô����ʽ�������Ҫ�趨�����һ��������������ǰ�������Ϊ������ƽ��ֵ��N����
	 */
	private static final double TIMES =2.1;
	/**
	 * ��ֺ��
	 * @param money ������ܽ��
	 * @param count ������
	 * @return
	 */
	public List<Integer> splitRedPackets(int money,int count){
		//��� �Ϸ���У��
		if(!isRight(money,count)){
			return null;
		}
		//����б�
		List<Integer> list =new ArrayList<Integer>();
		//ÿ��������Ľ��Ϊƽ������Times ��
		int max =(int)(money*TIMES/count);
		
		max = max>MAXMONEY ? MAXMONEY : max;
		//������
		for (int i = 0; i < count; i++) {
			int one = randomRedPacket(money,MINMONEY,max,count-i);
			list.add(one);
			money -=one;
		}
		return list;
	}
	/**
	 * �������һ�����
	 * @param money
	 * @param minS :��С���
	 * @param maxS �������(ÿ�������Ĭ��Times�����ֵ)
	 * @param count
	 * @return
	 */
	private int randomRedPacket(int money, int minS, int maxS, int count) {
		//����ֻ��һ����ֱ�ӷ��غ��
		if(count==1){
			return money;
		}
		//������С����� == ��������� ֱ�ӷ�����С�����
		if(minS ==maxS){
			return minS;
		}
		//У�� ���ֵ max Ҫ�Ǳ�money ���ߵĻ��� ȥ money ���
		int max = maxS>money ? money : maxS;
		//���һ����� = ���һ����* (���-��С)+��С
		int one =((int)Math.rint(Math.random()*(max-minS)+minS));
		//ʣ�µĽ��
		int moneyOther =money-one;
		//У��������������Ƿ���У����Ϸ��Ļ�����Ҫ���·��䷽��
		if(isRight(moneyOther, count-1)){
			return one;
		}else{
			//���·���
			double avg =moneyOther /(count-1);
			//���κ�����󣬵����´εĺ����С�������������´ξ����һ��Сֵ�����κ������һ�����
			if(avg<MINMONEY){
				 //�ݹ���ã��޸ĺ�������  
				return randomRedPacket(money, minS, one, count);
				
			}else if(avg>MAXMONEY){
				 //�ݹ���ã��޸ĺ����С���  
				return randomRedPacket(money, one, maxS, count);
			}
		}
		return one;
	}
	/**
	 * ��� �Ϸ���У��
	 * @param money
	 * @param count
	 * @return
	 */
	private boolean isRight(int money, int count) {
		double avg =money/count;
		//С����С���
		if(avg<MINMONEY){
			return false;
		//���������	
		}else if(avg>MAXMONEY){
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		//���һ��188.88  5�����
		RedEnvelopesDemo dd = new RedEnvelopesDemo();
		//��λ�Ƿ�
		System.out.println(dd.splitRedPackets(100, 10));
	}
}