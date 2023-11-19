package Bpg319_Q10;

public class Dictionary extends PairMap {
	int index=0;
	//생성자 
	public Dictionary(int size) {
		//궁금한 점: 매개변수가 없이 그냥 배열 크기만 제시하여 생성자를 만들면 실행이 안된다.. 왜그럴
		this.keyArray=new String[size];
		this.valueArray=new String[size];
		
	}

	@Override
	String get(String key) {
		String returnString = null;
		for (int i=0;i<keyArray.length;++i) {
			if(key.equals(this.keyArray[i])) {
				returnString=this.valueArray[i];
				//break해줘야 무의미하게 반복되는 걸 방지할 수 있을 것 같다.
				//배열의 사이즈보다 아래에서 구할 length로 하는 것도 좋을것 같다. (딕셔너리에 있는 크기)
			}
		}
		return returnString;
	}
	 

	@Override
	void put(String key, String value) {
		for(int i=0;i<this.keyArray.length;++i) {
			if (this.keyArray[i]!=null) {
				this.keyArray[i]=key;
				this.valueArray[i]=value;
				//기존 키가 있으면 새로운 value로 업데이트 
			}
		}
		keyArray[index]=key;
		valueArray[index]=value;
		index++;
	}

	@Override
	String delete(String key) {
		int i;
		for (i=0;i<this.keyArray.length;++i) {
			if(key.equals(this.keyArray[i])) {
				this.keyArray[i]=null;
				this.valueArray[i]=null;
				index--;
				return null;
			}
		}
		return valueArray[i];
	}

	@Override
	int length() {
		int iCnt=0;
		for (int i=0;i<this.keyArray.length;++i) {
			if (this.keyArray[i]==null) {
				
			}else {
				iCnt+=1;
			}
		}
		return iCnt;
	}

}
