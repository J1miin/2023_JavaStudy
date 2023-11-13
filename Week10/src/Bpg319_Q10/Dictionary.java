package Bpg319_Q10;

public class Dictionary extends PairMap {
	int index=0;
	//생성자 
	public Dictionary() {
		this.keyArray=new String[10];
		this.valueArray=new String[10];
		
	}

	@Override
	String get(String key) {
		String returnString = "Nothing";
		for (int i=0;i<keyArray.length;++i) {
			if(key.equals(this.keyArray[i])) {
				returnString=this.valueArray[i];
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
			if(this.keyArray[i].equals(key)) {
				this.keyArray[i]=null;
				this.valueArray[i]=null;
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
