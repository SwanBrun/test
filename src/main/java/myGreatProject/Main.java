package myGreatProject;

import org.apache.commons.lang.StringUtils;

import com.google.common.base.Strings;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Strings.isNullOrEmpty("toto"));
		System.out.println(StringUtils.isNotBlank("    a"));
		System.out.println(StringUtils.isNotBlank(""));
	}
}
