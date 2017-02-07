package com.github.pfrank13

import org.cassandraunit.spring.CassandraUnitDependencyInjectionIntegrationTestExecutionListener
import org.cassandraunit.spring.EmbeddedCassandra
import org.cassandraunit.spring.boot.EmbeddedCassandraTest
import org.cassandraunit.utils.EmbeddedCassandraServerHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestExecutionListeners
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource
import com.datastax.driver.core.Session
import org.assertj.core.api.Assertions

@RunWith(SpringRunner::class)
@SpringBootTest
@TestExecutionListeners(listeners = arrayOf(CassandraUnitDependencyInjectionIntegrationTestExecutionListener::class), mergeMode = TestExecutionListeners.MergeMode.MERGE_WITH_DEFAULTS)
@EmbeddedCassandra(configuration = EmbeddedCassandraServerHelper.CASSANDRA_RNDPORT_YML_FILE,timeout = 60000)
@EmbeddedCassandraTest
open class KotlinCoroutineCassandraParentPomApplicationTests {
  @Resource
  lateinit var session: Session
  
  @Test
  fun contextLoads() {
    Assertions.assertThat(session).isNotNull()
  }
  
}
