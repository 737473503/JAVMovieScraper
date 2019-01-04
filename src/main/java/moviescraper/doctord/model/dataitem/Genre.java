package moviescraper.doctord.model.dataitem;

import org.apache.http.util.TextUtils;

public class Genre extends MovieDataItem {

	private String genre;
	private int weight = 999;

	public Genre(String genre) {
		setGenre(genre);
		if (!TextUtils.isEmpty(genre)) {
			switch (genre) {
				case "中出":
					weight = 0;
					break;
				case "性奴":
					weight = 1;
					break;
				case "凌辱":
					weight = 2;
					break;
				case "恋腿癖":
					weight = 3;
					break;
				case "内衣":
					weight = 4;
					break;
				case "监禁":
					weight = 5;
					break;
				case "玩具":
					weight = 6;
					break;
				case "千金小姐":
					weight = 7;
					break;
				case "荡妇":
					weight = 8;
					break;
				case "花痴":
					weight = 9;
					break;
				case "各种职业":
					weight = 10;
					break;
				case "熟女":
					weight = 11;
					break;
				case "妓女":
					weight = 12;
					break;
				case "拘束":
					weight = 13;
					break;
				case "轮奸":
					weight = 14;
					break;
				case "深喉":
					weight = 15;
					break;
				case "吞精":
					weight = 16;
					break;
				case "颜射":
					weight = 17;
					break;
				case "制服":
					weight = 18;
					break;
				case "OL":
					weight = 19;
					break;
				case "角色扮演":
					weight = 20;
				case "女教师":
					weight = 21;
					break;
				case "家教":
					weight = 22;
					break;
				case "秘书":
					weight = 23;
					break;
				case "连裤袜":
					weight = 24;
					break;
				case "女医生":
					weight = 25;
					break;
				case "潮吹":
					weight = 26;
					break;
				case "粗暴":
					weight = 27;
					break;
				case "紧缚":
					weight = 28;
					break;
				case "寡妇":
					weight = 29;
					break;
				case "药物":
					weight = 30;
					break;
				case "流汗":
					weight = 31;
					break;
				case "巨大阳具":
					weight = 32;
					break;
				case "黑人演员":
					weight = 33;
					break;
				case "护士":
					weight = 34;
					break;
				case "女检察官":
					weight = 35;
					break;
				case "姐姐":
					weight = 36;
					break;
				case "淫语":
					weight = 37;
					break;
				case "兔女郎":
					weight = 38;
					break;
				case "空中小姐":
					weight = 39;
					break;
				case "女大学生":
					weight = 40;
					break;
				case "赛车女郎":
					weight = 41;
					break;
				case "旗袍":
					weight = 42;
					break;
				case "模特儿":
					weight = 43;
					break;

				default:
					break;
			}
		}
	}

	@Override
	public String toXML() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "Genre [genre=\"" + genre + "\"" + dataItemSourceToString() + "]";
	}

	public String getGenre() {
		return genre;
	}

	public int getWeight() {
		return weight;
	}

	public void setGenre(String genre) {
		this.genre = sanitizeString(genre);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Genre other = (Genre) obj;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		return true;
	}

	public Genre() {
		genre = "";
	}

}
