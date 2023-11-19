package number10;

class Dictionary extends PairMap {
	private int usedArrayCnt =0;
	
	public Dictionary (int size) {
		keyArray = new String [size];
		valueArray = new String [size];
		//이미 배열 선언은 추상클래스에 되어 있으므로 생성을 해준다.
	}
	
	@Override
	String get(String key) {
		String value = null;
		for (int i=0;i<usedArrayCnt;++i) {
			if(keyArray[i].equals(key)) {
				value = valueArray[i];
			}
		}
		return value;
	}

	@Override
	void put(String key, String value) {
		for (int i=0;i<usedArrayCnt;++i) {
			if(keyArray[i].equals(key)) {
				valueArray[i]=value; //key가 있으면 value만 업데이
			}
		}
		//key배열 내에 입력된 key가 없는 경우 새롭게 key, value 추가한다. 
		keyArray[usedArrayCnt]=key;
		valueArray[usedArrayCnt]=value;
		usedArrayCnt ++; //keyArray 원소 개수를 카운트하는 인덱스를 하나 키운다.
	}

	@Override
	String delete(String key) {
		String deleteValue =null;
		int i;
		for (i=0;i<usedArrayCnt;++i) {
			if (keyArray[i].equals(key)) {
				deleteValue = valueArray[i];
				keyArray[i] = null;
				valueArray[i] = null;
				
				// 삭제 후 배열 재정렬
				// 앞으로 당길 때 j=i라는 아이디어를 쓸 수 있구나!
				for (int j = i; j < usedArrayCnt - 1; j++) {
					//usedArrayCnt-1은 예를 들어 해보면 -1을 하게 된다. 
				    keyArray[j] = keyArray[j + 1];
				    valueArray[j] = valueArray[j + 1];
				}
				//가장 마지막 것을 댕겨왔으니, 가장 마지막은 삭제해줘야한다.
				keyArray[usedArrayCnt - 1] = null;  
				valueArray[usedArrayCnt - 1] = null;
				usedArrayCnt--;
			}
		}

		return deleteValue;
	}

	@Override
	int length() {
		return usedArrayCnt;
	}

}
