/*******************************************************************************
 * Copyright (c) 2015-2017 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /org.modmacao.openstack.swe.runtime/model/ossweruntime.ecore
 * using:
 *   /org.modmacao.openstack.swe.runtime/model/ossweruntime.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package ossweruntime;

import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.cmf.occi.crtp.CrtpTables;
import org.eclipse.cmf.occi.infrastructure.InfrastructureTables;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import ossweruntime.OssweruntimeTables;

/**
 * OssweruntimeTables provides the dispatch tables for the ossweruntime for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class OssweruntimeTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(OssweruntimePackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			OssweruntimeTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OssweruntimeTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final /*@NonNull*/ EcoreExecutorType _Swe_large = new EcoreExecutorType(OssweruntimePackage.Literals.SWE_LARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Swe_medium = new EcoreExecutorType(OssweruntimePackage.Literals.SWE_MEDIUM, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Swe_mem_large = new EcoreExecutorType(OssweruntimePackage.Literals.SWE_MEM_LARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Swe_mem_medium = new EcoreExecutorType(OssweruntimePackage.Literals.SWE_MEM_MEDIUM, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Swe_mem_small = new EcoreExecutorType(OssweruntimePackage.Literals.SWE_MEM_SMALL, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Swe_small = new EcoreExecutorType(OssweruntimePackage.Literals.SWE_SMALL, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Ubuntu_bionicbeaver_python = new EcoreExecutorType(OssweruntimePackage.Literals.UBUNTU_BIONICBEAVER_PYTHON, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Ubuntu_trustytahr = new EcoreExecutorType(OssweruntimePackage.Literals.UBUNTU_TRUSTYTAHR, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Ubuntu_xenialxerus = new EcoreExecutorType(OssweruntimePackage.Literals.UBUNTU_XENIALXERUS, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Swe_large,
			_Swe_medium,
			_Swe_mem_large,
			_Swe_mem_medium,
			_Swe_mem_small,
			_Swe_small,
			_Ubuntu_bionicbeaver_python,
			_Ubuntu_trustytahr,
			_Ubuntu_xenialxerus
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OssweruntimeTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final /*@NonNull*/ ExecutorFragment _Swe_large__Large = new ExecutorFragment(Types._Swe_large, CrtpTables.Types._Large);
		private static final /*@NonNull*/ ExecutorFragment _Swe_large__MixinBase = new ExecutorFragment(Types._Swe_large, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Swe_large__OclAny = new ExecutorFragment(Types._Swe_large, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Swe_large__OclElement = new ExecutorFragment(Types._Swe_large, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Swe_large__Resource_tpl = new ExecutorFragment(Types._Swe_large, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _Swe_large__Swe_large = new ExecutorFragment(Types._Swe_large, OssweruntimeTables.Types._Swe_large);

		private static final /*@NonNull*/ ExecutorFragment _Swe_medium__Medium = new ExecutorFragment(Types._Swe_medium, CrtpTables.Types._Medium);
		private static final /*@NonNull*/ ExecutorFragment _Swe_medium__MixinBase = new ExecutorFragment(Types._Swe_medium, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Swe_medium__OclAny = new ExecutorFragment(Types._Swe_medium, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Swe_medium__OclElement = new ExecutorFragment(Types._Swe_medium, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Swe_medium__Resource_tpl = new ExecutorFragment(Types._Swe_medium, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _Swe_medium__Swe_medium = new ExecutorFragment(Types._Swe_medium, OssweruntimeTables.Types._Swe_medium);

		private static final /*@NonNull*/ ExecutorFragment _Swe_mem_large__Mem_large = new ExecutorFragment(Types._Swe_mem_large, CrtpTables.Types._Mem_large);
		private static final /*@NonNull*/ ExecutorFragment _Swe_mem_large__MixinBase = new ExecutorFragment(Types._Swe_mem_large, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Swe_mem_large__OclAny = new ExecutorFragment(Types._Swe_mem_large, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Swe_mem_large__OclElement = new ExecutorFragment(Types._Swe_mem_large, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Swe_mem_large__Resource_tpl = new ExecutorFragment(Types._Swe_mem_large, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _Swe_mem_large__Swe_mem_large = new ExecutorFragment(Types._Swe_mem_large, OssweruntimeTables.Types._Swe_mem_large);

		private static final /*@NonNull*/ ExecutorFragment _Swe_mem_medium__Mem_medium = new ExecutorFragment(Types._Swe_mem_medium, CrtpTables.Types._Mem_medium);
		private static final /*@NonNull*/ ExecutorFragment _Swe_mem_medium__MixinBase = new ExecutorFragment(Types._Swe_mem_medium, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Swe_mem_medium__OclAny = new ExecutorFragment(Types._Swe_mem_medium, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Swe_mem_medium__OclElement = new ExecutorFragment(Types._Swe_mem_medium, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Swe_mem_medium__Resource_tpl = new ExecutorFragment(Types._Swe_mem_medium, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _Swe_mem_medium__Swe_mem_medium = new ExecutorFragment(Types._Swe_mem_medium, OssweruntimeTables.Types._Swe_mem_medium);

		private static final /*@NonNull*/ ExecutorFragment _Swe_mem_small__Mem_small = new ExecutorFragment(Types._Swe_mem_small, CrtpTables.Types._Mem_small);
		private static final /*@NonNull*/ ExecutorFragment _Swe_mem_small__MixinBase = new ExecutorFragment(Types._Swe_mem_small, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Swe_mem_small__OclAny = new ExecutorFragment(Types._Swe_mem_small, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Swe_mem_small__OclElement = new ExecutorFragment(Types._Swe_mem_small, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Swe_mem_small__Resource_tpl = new ExecutorFragment(Types._Swe_mem_small, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _Swe_mem_small__Swe_mem_small = new ExecutorFragment(Types._Swe_mem_small, OssweruntimeTables.Types._Swe_mem_small);

		private static final /*@NonNull*/ ExecutorFragment _Swe_small__MixinBase = new ExecutorFragment(Types._Swe_small, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Swe_small__OclAny = new ExecutorFragment(Types._Swe_small, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Swe_small__OclElement = new ExecutorFragment(Types._Swe_small, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Swe_small__Resource_tpl = new ExecutorFragment(Types._Swe_small, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _Swe_small__Small = new ExecutorFragment(Types._Swe_small, CrtpTables.Types._Small);
		private static final /*@NonNull*/ ExecutorFragment _Swe_small__Swe_small = new ExecutorFragment(Types._Swe_small, OssweruntimeTables.Types._Swe_small);

		private static final /*@NonNull*/ ExecutorFragment _Ubuntu_bionicbeaver_python__MixinBase = new ExecutorFragment(Types._Ubuntu_bionicbeaver_python, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Ubuntu_bionicbeaver_python__OclAny = new ExecutorFragment(Types._Ubuntu_bionicbeaver_python, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Ubuntu_bionicbeaver_python__OclElement = new ExecutorFragment(Types._Ubuntu_bionicbeaver_python, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Ubuntu_bionicbeaver_python__Os_tpl = new ExecutorFragment(Types._Ubuntu_bionicbeaver_python, InfrastructureTables.Types._Os_tpl);
		private static final /*@NonNull*/ ExecutorFragment _Ubuntu_bionicbeaver_python__Ubuntu_bionicbeaver_python = new ExecutorFragment(Types._Ubuntu_bionicbeaver_python, OssweruntimeTables.Types._Ubuntu_bionicbeaver_python);

		private static final /*@NonNull*/ ExecutorFragment _Ubuntu_trustytahr__MixinBase = new ExecutorFragment(Types._Ubuntu_trustytahr, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Ubuntu_trustytahr__OclAny = new ExecutorFragment(Types._Ubuntu_trustytahr, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Ubuntu_trustytahr__OclElement = new ExecutorFragment(Types._Ubuntu_trustytahr, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Ubuntu_trustytahr__Os_tpl = new ExecutorFragment(Types._Ubuntu_trustytahr, InfrastructureTables.Types._Os_tpl);
		private static final /*@NonNull*/ ExecutorFragment _Ubuntu_trustytahr__Ubuntu_trustytahr = new ExecutorFragment(Types._Ubuntu_trustytahr, OssweruntimeTables.Types._Ubuntu_trustytahr);

		private static final /*@NonNull*/ ExecutorFragment _Ubuntu_xenialxerus__MixinBase = new ExecutorFragment(Types._Ubuntu_xenialxerus, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Ubuntu_xenialxerus__OclAny = new ExecutorFragment(Types._Ubuntu_xenialxerus, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Ubuntu_xenialxerus__OclElement = new ExecutorFragment(Types._Ubuntu_xenialxerus, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Ubuntu_xenialxerus__Os_tpl = new ExecutorFragment(Types._Ubuntu_xenialxerus, InfrastructureTables.Types._Os_tpl);
		private static final /*@NonNull*/ ExecutorFragment _Ubuntu_xenialxerus__Ubuntu_xenialxerus = new ExecutorFragment(Types._Ubuntu_xenialxerus, OssweruntimeTables.Types._Ubuntu_xenialxerus);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OssweruntimeTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OssweruntimeTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OssweruntimeTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final /*@NonNull*/ ExecutorProperty _Swe_large__openstackRuntimeId = new EcoreExecutorProperty(OssweruntimePackage.Literals.SWE_LARGE__OPENSTACK_RUNTIME_ID, Types._Swe_large, 0);

		public static final /*@NonNull*/ ExecutorProperty _Swe_medium__openstackRuntimeId = new EcoreExecutorProperty(OssweruntimePackage.Literals.SWE_MEDIUM__OPENSTACK_RUNTIME_ID, Types._Swe_medium, 0);

		public static final /*@NonNull*/ ExecutorProperty _Swe_mem_large__openstackRuntimeId = new EcoreExecutorProperty(OssweruntimePackage.Literals.SWE_MEM_LARGE__OPENSTACK_RUNTIME_ID, Types._Swe_mem_large, 0);

		public static final /*@NonNull*/ ExecutorProperty _Swe_mem_medium__openstackRuntimeId = new EcoreExecutorProperty(OssweruntimePackage.Literals.SWE_MEM_MEDIUM__OPENSTACK_RUNTIME_ID, Types._Swe_mem_medium, 0);

		public static final /*@NonNull*/ ExecutorProperty _Swe_mem_small__openstackRuntimeId = new EcoreExecutorProperty(OssweruntimePackage.Literals.SWE_MEM_SMALL__OPENSTACK_RUNTIME_ID, Types._Swe_mem_small, 0);

		public static final /*@NonNull*/ ExecutorProperty _Swe_small__openstackRuntimeId = new EcoreExecutorProperty(OssweruntimePackage.Literals.SWE_SMALL__OPENSTACK_RUNTIME_ID, Types._Swe_small, 0);

		public static final /*@NonNull*/ ExecutorProperty _Ubuntu_bionicbeaver_python__openstackRuntimeId = new EcoreExecutorProperty(OssweruntimePackage.Literals.UBUNTU_BIONICBEAVER_PYTHON__OPENSTACK_RUNTIME_ID, Types._Ubuntu_bionicbeaver_python, 0);

		public static final /*@NonNull*/ ExecutorProperty _Ubuntu_trustytahr__openstackRuntimeId = new EcoreExecutorProperty(OssweruntimePackage.Literals.UBUNTU_TRUSTYTAHR__OPENSTACK_RUNTIME_ID, Types._Ubuntu_trustytahr, 0);

		public static final /*@NonNull*/ ExecutorProperty _Ubuntu_xenialxerus__openstackRuntimeId = new EcoreExecutorProperty(OssweruntimePackage.Literals.UBUNTU_XENIALXERUS__OPENSTACK_RUNTIME_ID, Types._Ubuntu_xenialxerus, 0);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OssweruntimeTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Swe_large =
			{
				Fragments._Swe_large__OclAny /* 0 */,
				Fragments._Swe_large__OclElement /* 1 */,
				Fragments._Swe_large__MixinBase /* 2 */,
				Fragments._Swe_large__Resource_tpl /* 3 */,
				Fragments._Swe_large__Large /* 4 */,
				Fragments._Swe_large__Swe_large /* 5 */
			};
		private static final int /*@NonNull*/ [] __Swe_large = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Swe_medium =
			{
				Fragments._Swe_medium__OclAny /* 0 */,
				Fragments._Swe_medium__OclElement /* 1 */,
				Fragments._Swe_medium__MixinBase /* 2 */,
				Fragments._Swe_medium__Resource_tpl /* 3 */,
				Fragments._Swe_medium__Medium /* 4 */,
				Fragments._Swe_medium__Swe_medium /* 5 */
			};
		private static final int /*@NonNull*/ [] __Swe_medium = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Swe_mem_large =
			{
				Fragments._Swe_mem_large__OclAny /* 0 */,
				Fragments._Swe_mem_large__OclElement /* 1 */,
				Fragments._Swe_mem_large__MixinBase /* 2 */,
				Fragments._Swe_mem_large__Resource_tpl /* 3 */,
				Fragments._Swe_mem_large__Mem_large /* 4 */,
				Fragments._Swe_mem_large__Swe_mem_large /* 5 */
			};
		private static final int /*@NonNull*/ [] __Swe_mem_large = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Swe_mem_medium =
			{
				Fragments._Swe_mem_medium__OclAny /* 0 */,
				Fragments._Swe_mem_medium__OclElement /* 1 */,
				Fragments._Swe_mem_medium__MixinBase /* 2 */,
				Fragments._Swe_mem_medium__Resource_tpl /* 3 */,
				Fragments._Swe_mem_medium__Mem_medium /* 4 */,
				Fragments._Swe_mem_medium__Swe_mem_medium /* 5 */
			};
		private static final int /*@NonNull*/ [] __Swe_mem_medium = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Swe_mem_small =
			{
				Fragments._Swe_mem_small__OclAny /* 0 */,
				Fragments._Swe_mem_small__OclElement /* 1 */,
				Fragments._Swe_mem_small__MixinBase /* 2 */,
				Fragments._Swe_mem_small__Resource_tpl /* 3 */,
				Fragments._Swe_mem_small__Mem_small /* 4 */,
				Fragments._Swe_mem_small__Swe_mem_small /* 5 */
			};
		private static final int /*@NonNull*/ [] __Swe_mem_small = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Swe_small =
			{
				Fragments._Swe_small__OclAny /* 0 */,
				Fragments._Swe_small__OclElement /* 1 */,
				Fragments._Swe_small__MixinBase /* 2 */,
				Fragments._Swe_small__Resource_tpl /* 3 */,
				Fragments._Swe_small__Small /* 4 */,
				Fragments._Swe_small__Swe_small /* 5 */
			};
		private static final int /*@NonNull*/ [] __Swe_small = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Ubuntu_bionicbeaver_python =
			{
				Fragments._Ubuntu_bionicbeaver_python__OclAny /* 0 */,
				Fragments._Ubuntu_bionicbeaver_python__OclElement /* 1 */,
				Fragments._Ubuntu_bionicbeaver_python__MixinBase /* 2 */,
				Fragments._Ubuntu_bionicbeaver_python__Os_tpl /* 3 */,
				Fragments._Ubuntu_bionicbeaver_python__Ubuntu_bionicbeaver_python /* 4 */
			};
		private static final int /*@NonNull*/ [] __Ubuntu_bionicbeaver_python = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Ubuntu_trustytahr =
			{
				Fragments._Ubuntu_trustytahr__OclAny /* 0 */,
				Fragments._Ubuntu_trustytahr__OclElement /* 1 */,
				Fragments._Ubuntu_trustytahr__MixinBase /* 2 */,
				Fragments._Ubuntu_trustytahr__Os_tpl /* 3 */,
				Fragments._Ubuntu_trustytahr__Ubuntu_trustytahr /* 4 */
			};
		private static final int /*@NonNull*/ [] __Ubuntu_trustytahr = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Ubuntu_xenialxerus =
			{
				Fragments._Ubuntu_xenialxerus__OclAny /* 0 */,
				Fragments._Ubuntu_xenialxerus__OclElement /* 1 */,
				Fragments._Ubuntu_xenialxerus__MixinBase /* 2 */,
				Fragments._Ubuntu_xenialxerus__Os_tpl /* 3 */,
				Fragments._Ubuntu_xenialxerus__Ubuntu_xenialxerus /* 4 */
			};
		private static final int /*@NonNull*/ [] __Ubuntu_xenialxerus = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Swe_large.initFragments(_Swe_large, __Swe_large);
			Types._Swe_medium.initFragments(_Swe_medium, __Swe_medium);
			Types._Swe_mem_large.initFragments(_Swe_mem_large, __Swe_mem_large);
			Types._Swe_mem_medium.initFragments(_Swe_mem_medium, __Swe_mem_medium);
			Types._Swe_mem_small.initFragments(_Swe_mem_small, __Swe_mem_small);
			Types._Swe_small.initFragments(_Swe_small, __Swe_small);
			Types._Ubuntu_bionicbeaver_python.initFragments(_Ubuntu_bionicbeaver_python, __Ubuntu_bionicbeaver_python);
			Types._Ubuntu_trustytahr.initFragments(_Ubuntu_trustytahr, __Ubuntu_trustytahr);
			Types._Ubuntu_xenialxerus.initFragments(_Ubuntu_xenialxerus, __Ubuntu_xenialxerus);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OssweruntimeTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Swe_large__Swe_large = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Swe_large__Large = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Swe_large__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Swe_large__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Swe_large__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Swe_large__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Swe_medium__Swe_medium = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Swe_medium__Medium = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Swe_medium__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Swe_medium__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Swe_medium__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Swe_medium__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Swe_mem_large__Swe_mem_large = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Swe_mem_large__Mem_large = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Swe_mem_large__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Swe_mem_large__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Swe_mem_large__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Swe_mem_large__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Swe_mem_medium__Swe_mem_medium = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Swe_mem_medium__Mem_medium = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Swe_mem_medium__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Swe_mem_medium__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Swe_mem_medium__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Swe_mem_medium__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Swe_mem_small__Swe_mem_small = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Swe_mem_small__Mem_small = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Swe_mem_small__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Swe_mem_small__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Swe_mem_small__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Swe_mem_small__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Swe_small__Swe_small = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Swe_small__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Swe_small__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Swe_small__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Swe_small__Resource_tpl = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Swe_small__Small = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ubuntu_bionicbeaver_python__Ubuntu_bionicbeaver_python = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ubuntu_bionicbeaver_python__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ubuntu_bionicbeaver_python__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ubuntu_bionicbeaver_python__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ubuntu_bionicbeaver_python__Os_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ubuntu_trustytahr__Ubuntu_trustytahr = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ubuntu_trustytahr__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ubuntu_trustytahr__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ubuntu_trustytahr__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ubuntu_trustytahr__Os_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ubuntu_xenialxerus__Ubuntu_xenialxerus = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ubuntu_xenialxerus__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ubuntu_xenialxerus__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ubuntu_xenialxerus__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ubuntu_xenialxerus__Os_tpl = {};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Swe_large__Large.initOperations(_Swe_large__Large);
			Fragments._Swe_large__MixinBase.initOperations(_Swe_large__MixinBase);
			Fragments._Swe_large__OclAny.initOperations(_Swe_large__OclAny);
			Fragments._Swe_large__OclElement.initOperations(_Swe_large__OclElement);
			Fragments._Swe_large__Resource_tpl.initOperations(_Swe_large__Resource_tpl);
			Fragments._Swe_large__Swe_large.initOperations(_Swe_large__Swe_large);

			Fragments._Swe_medium__Medium.initOperations(_Swe_medium__Medium);
			Fragments._Swe_medium__MixinBase.initOperations(_Swe_medium__MixinBase);
			Fragments._Swe_medium__OclAny.initOperations(_Swe_medium__OclAny);
			Fragments._Swe_medium__OclElement.initOperations(_Swe_medium__OclElement);
			Fragments._Swe_medium__Resource_tpl.initOperations(_Swe_medium__Resource_tpl);
			Fragments._Swe_medium__Swe_medium.initOperations(_Swe_medium__Swe_medium);

			Fragments._Swe_mem_large__Mem_large.initOperations(_Swe_mem_large__Mem_large);
			Fragments._Swe_mem_large__MixinBase.initOperations(_Swe_mem_large__MixinBase);
			Fragments._Swe_mem_large__OclAny.initOperations(_Swe_mem_large__OclAny);
			Fragments._Swe_mem_large__OclElement.initOperations(_Swe_mem_large__OclElement);
			Fragments._Swe_mem_large__Resource_tpl.initOperations(_Swe_mem_large__Resource_tpl);
			Fragments._Swe_mem_large__Swe_mem_large.initOperations(_Swe_mem_large__Swe_mem_large);

			Fragments._Swe_mem_medium__Mem_medium.initOperations(_Swe_mem_medium__Mem_medium);
			Fragments._Swe_mem_medium__MixinBase.initOperations(_Swe_mem_medium__MixinBase);
			Fragments._Swe_mem_medium__OclAny.initOperations(_Swe_mem_medium__OclAny);
			Fragments._Swe_mem_medium__OclElement.initOperations(_Swe_mem_medium__OclElement);
			Fragments._Swe_mem_medium__Resource_tpl.initOperations(_Swe_mem_medium__Resource_tpl);
			Fragments._Swe_mem_medium__Swe_mem_medium.initOperations(_Swe_mem_medium__Swe_mem_medium);

			Fragments._Swe_mem_small__Mem_small.initOperations(_Swe_mem_small__Mem_small);
			Fragments._Swe_mem_small__MixinBase.initOperations(_Swe_mem_small__MixinBase);
			Fragments._Swe_mem_small__OclAny.initOperations(_Swe_mem_small__OclAny);
			Fragments._Swe_mem_small__OclElement.initOperations(_Swe_mem_small__OclElement);
			Fragments._Swe_mem_small__Resource_tpl.initOperations(_Swe_mem_small__Resource_tpl);
			Fragments._Swe_mem_small__Swe_mem_small.initOperations(_Swe_mem_small__Swe_mem_small);

			Fragments._Swe_small__MixinBase.initOperations(_Swe_small__MixinBase);
			Fragments._Swe_small__OclAny.initOperations(_Swe_small__OclAny);
			Fragments._Swe_small__OclElement.initOperations(_Swe_small__OclElement);
			Fragments._Swe_small__Resource_tpl.initOperations(_Swe_small__Resource_tpl);
			Fragments._Swe_small__Small.initOperations(_Swe_small__Small);
			Fragments._Swe_small__Swe_small.initOperations(_Swe_small__Swe_small);

			Fragments._Ubuntu_bionicbeaver_python__MixinBase.initOperations(_Ubuntu_bionicbeaver_python__MixinBase);
			Fragments._Ubuntu_bionicbeaver_python__OclAny.initOperations(_Ubuntu_bionicbeaver_python__OclAny);
			Fragments._Ubuntu_bionicbeaver_python__OclElement.initOperations(_Ubuntu_bionicbeaver_python__OclElement);
			Fragments._Ubuntu_bionicbeaver_python__Os_tpl.initOperations(_Ubuntu_bionicbeaver_python__Os_tpl);
			Fragments._Ubuntu_bionicbeaver_python__Ubuntu_bionicbeaver_python.initOperations(_Ubuntu_bionicbeaver_python__Ubuntu_bionicbeaver_python);

			Fragments._Ubuntu_trustytahr__MixinBase.initOperations(_Ubuntu_trustytahr__MixinBase);
			Fragments._Ubuntu_trustytahr__OclAny.initOperations(_Ubuntu_trustytahr__OclAny);
			Fragments._Ubuntu_trustytahr__OclElement.initOperations(_Ubuntu_trustytahr__OclElement);
			Fragments._Ubuntu_trustytahr__Os_tpl.initOperations(_Ubuntu_trustytahr__Os_tpl);
			Fragments._Ubuntu_trustytahr__Ubuntu_trustytahr.initOperations(_Ubuntu_trustytahr__Ubuntu_trustytahr);

			Fragments._Ubuntu_xenialxerus__MixinBase.initOperations(_Ubuntu_xenialxerus__MixinBase);
			Fragments._Ubuntu_xenialxerus__OclAny.initOperations(_Ubuntu_xenialxerus__OclAny);
			Fragments._Ubuntu_xenialxerus__OclElement.initOperations(_Ubuntu_xenialxerus__OclElement);
			Fragments._Ubuntu_xenialxerus__Os_tpl.initOperations(_Ubuntu_xenialxerus__Os_tpl);
			Fragments._Ubuntu_xenialxerus__Ubuntu_xenialxerus.initOperations(_Ubuntu_xenialxerus__Ubuntu_xenialxerus);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OssweruntimeTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Swe_large = {
			OssweruntimeTables.Properties._Swe_large__openstackRuntimeId
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Swe_medium = {
			OssweruntimeTables.Properties._Swe_medium__openstackRuntimeId
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Swe_mem_large = {
			OssweruntimeTables.Properties._Swe_mem_large__openstackRuntimeId
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Swe_mem_medium = {
			OssweruntimeTables.Properties._Swe_mem_medium__openstackRuntimeId
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Swe_mem_small = {
			OssweruntimeTables.Properties._Swe_mem_small__openstackRuntimeId
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Swe_small = {
			OssweruntimeTables.Properties._Swe_small__openstackRuntimeId
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Ubuntu_bionicbeaver_python = {
			OssweruntimeTables.Properties._Ubuntu_bionicbeaver_python__openstackRuntimeId
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Ubuntu_trustytahr = {
			OssweruntimeTables.Properties._Ubuntu_trustytahr__openstackRuntimeId
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Ubuntu_xenialxerus = {
			OssweruntimeTables.Properties._Ubuntu_xenialxerus__openstackRuntimeId
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Swe_large__Swe_large.initProperties(_Swe_large);
			Fragments._Swe_medium__Swe_medium.initProperties(_Swe_medium);
			Fragments._Swe_mem_large__Swe_mem_large.initProperties(_Swe_mem_large);
			Fragments._Swe_mem_medium__Swe_mem_medium.initProperties(_Swe_mem_medium);
			Fragments._Swe_mem_small__Swe_mem_small.initProperties(_Swe_mem_small);
			Fragments._Swe_small__Swe_small.initProperties(_Swe_small);
			Fragments._Ubuntu_bionicbeaver_python__Ubuntu_bionicbeaver_python.initProperties(_Ubuntu_bionicbeaver_python);
			Fragments._Ubuntu_trustytahr__Ubuntu_trustytahr.initProperties(_Ubuntu_trustytahr);
			Fragments._Ubuntu_xenialxerus__Ubuntu_xenialxerus.initProperties(_Ubuntu_xenialxerus);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OssweruntimeTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OssweruntimeTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual cobstruction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual cobstruction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {}
}
