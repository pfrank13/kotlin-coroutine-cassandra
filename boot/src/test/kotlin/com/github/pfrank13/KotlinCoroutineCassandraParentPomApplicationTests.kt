package com.github.pfrank13

import org.cassandraunit.spring.CassandraUnitDependencyInjectionIntegrationTestExecutionListener
import org.cassandraunit.spring.EmbeddedCassandra
import org.cassandraunit.utils.EmbeddedCassandraServerHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestExecutionListeners
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
@TestExecutionListeners(listeners = arrayOf(CassandraUnitDependencyInjectionIntegrationTestExecutionListener::class), mergeMode = TestExecutionListeners.MergeMode.MERGE_WITH_DEFAULTS)
@EmbeddedCassandra(configuration = EmbeddedCassandraServerHelper.CASSANDRA_RNDPORT_YML_FILE,timeout = 60000)
open class KotlinCoroutineCassandraParentPomApplicationTests {
  
  @Test
  fun contextLoads() {
  }
  
}
