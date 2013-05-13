package tycho_test;

import org.apache.commons.codec.language.Soundex;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

  /**
   * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
   */
  @Override
  public void start(final BundleContext context) throws Exception {
    System.out.println("Hello World!!");
    System.out.println(new Soundex().encode("Hello World!!"));
  }

  /**
   * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
   */
  @Override
  public void stop(final BundleContext context) throws Exception {
    System.out.println("Goodbye World!!");
  }

}
