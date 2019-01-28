package chapter6;

import java.util.Arrays;
import java.util.Comparator;

class Quiz6_16_PhyscData {
	// ��ü�˻� ������
	static class PhyscData {
		String name; // �̸�
		int height; // Ű
		double vision; // �÷�

		// ������
		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}

		// ���ڿ���
		public String toString() {
			return name + " " + height + " " + vision;
		}

		// �÷� ���������� comparator
		static final Comparator<PhyscData> VISION_RORDER = new VisionROrderComparator();

		private static class VisionROrderComparator implements Comparator<PhyscData> {
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.vision < d2.vision) ? 1 : (d1.vision > d2.vision) ? -1 : 0;
			}
		}
	}

	public static void main(String[] args) {
		PhyscData[] x = { new PhyscData("�̳���", 162, 0.3), new PhyscData("������", 173, 0.7),
				new PhyscData("�̼���", 175, 2.0), new PhyscData("ȫ�ر�", 171, 1.5), new PhyscData("������", 168, 0.4),
				new PhyscData("��ȣ��", 174, 1.2), new PhyscData("���Ѱ�", 169, 0.8), };

		Arrays.sort(x, // �迭 x��
				PhyscData.VISION_RORDER // HEIGHT_ORDER�� ����Ͽ� sort
		);

		System.out.println("�� ��ü�˻� ����Ʈ ��");
		System.out.println(" �̸�       Ű        �÷�");
		System.out.println("---------------");
		for (int i = 0; i < x.length; i++)
			System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
	}
}