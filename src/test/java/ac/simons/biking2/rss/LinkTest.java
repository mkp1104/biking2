/*
 * Copyright 2014 michael-simons.eu.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ac.simons.biking2.rss;

import org.junit.Test;
import org.outsideMyBox.testUtils.BeanLikeTester;
import org.outsideMyBox.testUtils.BeanLikeTester.PropertiesAndValues;

/**
 * @author Michael J. Simons, 2014-05-23
 */
public class LinkTest {
    @Test
    public void beanShouldWorkAsExpected() {
	final BeanLikeTester beanLikeTester = new BeanLikeTester(Link.class);

	final PropertiesAndValues defaultValues = new PropertiesAndValues();
	defaultValues.put("rel", null);
	defaultValues.put("type", null);
	defaultValues.put("href", null);	

	beanLikeTester.testDefaultValues(defaultValues);

	final PropertiesAndValues values = new PropertiesAndValues();
	values.put("rel", "rel");
	values.put("type", "type");
	values.put("href", "href");

	beanLikeTester.testMutatorsAndAccessors(defaultValues, values);
    }
}
